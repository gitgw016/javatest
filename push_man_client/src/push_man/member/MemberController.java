package push_man.member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import push_man.main.ClientMain;
import push_man.vo.MemberVO;

public class MemberController implements Initializable, MemberInterface {
	
	@FXML private WebView webView;
	@FXML private ImageView imageView;
	@FXML private AnchorPane joinAnchor,loginAnchor;
	@FXML private TextField joinID,joinName,loginID;
	@FXML private PasswordField loginPW, joinPW, joinRePW;
	@FXML private Button btnLogin, btnJoin;
	@FXML private Hyperlink loginLinkBtn, joinLinkBtn;
	@FXML private Label checkID;
	
	// 중복아이디 체크 완료
	boolean isJoin;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ClientMain.thread.memberController = this;
		WebEngine wg = webView.getEngine();
		wg.load("https://www.youtube.com/embed/I8So1qmFH7k");
		// 영상 작동자의 상태에 대해 행동을 더함
		wg.getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
			@Override
			public void changed(ObservableValue<? extends State> observable, State oldValue, State newValue) {
				// WebView Load 완료 상태
				if(newValue.equals(State.SUCCEEDED)) {
					imageView.setVisible(false);
				}
			}
		});
		setHyperLink();
		setJoinEvent();
		setLoginEvent();
		System.out.println("완료");
	}


	@Override
	public void setHyperLink() {
		joinLinkBtn.setOnAction(e->{
			Platform.runLater(()->{
				loginAnchor.setVisible(false);
				loginAnchor.setDisable(true);
				joinAnchor.setVisible(true);
				joinAnchor.setDisable(false);
				joinID.requestFocus();
			});
		});
		
		loginLinkBtn.setOnAction(e->{
			loginAnchor.setVisible(true);
			loginAnchor.setDisable(false);
			joinAnchor.setVisible(false);
			joinAnchor.setDisable(true);
			loginID.requestFocus();
		});
	}


	@Override
	public void initLoginUI() {
		Platform.runLater(()->{
			loginID.clear();
			loginPW.clear();
			loginID.requestFocus();
		});
	}


	@Override
	public void initJoinUI() {
		Platform.runLater(()->{
			joinID.clear();
			joinPW.clear();
			joinRePW.clear();
			joinName.clear();
			joinID.requestFocus();
		});
	}


	@Override
	public void setLoginEvent() {
		
	}


	@Override
	public void setJoinEvent() {
		joinID.textProperty().addListener((o,b,text)->{
			System.out.println(text);
			if(!text.trim().equals("")) {
				MemberVO member = new MemberVO(text);
				// 아이디 중복 체크
				member.setOrder(0);
				ClientMain.thread.sendData(member);
			}else {
				setJoinIDCheck(false);
			}
		});
		
		btnJoin.setOnAction(event->{
			String id = joinID.getText().trim();
			String pw = joinPW.getText().trim();
			String repw = joinRePW.getText().trim();
			String nick = joinName.getText().trim();
			
			if(id.equals("") || !isJoin) {
				joinID.clear();
				joinID.requestFocus();
			}else if(!pw.equals(repw)) {
				joinPW.clear();
				joinRePW.clear();
				joinPW.requestFocus();
				checkID.setText("비밀번호 불일치");
			}else {
				MemberVO member = new MemberVO(nick,id,pw);
				member.setOrder(1);
				ClientMain.thread.sendData(member);
			}
		});
	}

	// 아이디 중복체크 UI 변경
	@Override
	public void setJoinIDCheck(boolean isChecked) {
		Platform.runLater(()->{
			String style = isChecked ? "-fx-text-fill:green;" : "-fx-text-fill:red;";
			String text = isChecked ? "사용 가능" : "사용 불가";
			checkID.setStyle(style);
			checkID.setText(text);
		});
	}


	@Override
	public void setJoinCheck(boolean isSuccess) {
		if(isSuccess) {
			System.out.println("회원가입 성공");
			joinAnchor.setVisible(false);
			joinAnchor.setDisable(true);
			loginAnchor.setVisible(true);
			loginAnchor.setDisable(false);
			initLoginUI();
		}else {
			System.out.println("가입 실패");
			initJoinUI();
		}
	}


	@Override
	public void setLoginCheck(MemberVO vo) {
	}


	@Override
	public void receiveData(MemberVO vo) {
		// 0 : 아이디 중복 체크 / 1 : 회원가입 / 2 : 로그인
		switch(vo.getOrder()) {
			case 0 :
				System.out.println("아이디 중복 체크");
				isJoin = vo.isSuccess();
				setJoinIDCheck(isJoin);
				break;
			case 1 :
				System.out.println("회원가입 요청 처리 결과");
				setJoinCheck(vo.isSuccess());
				break;
			case 2 :
				System.out.println("로그인 요청 처리 결과");
				break;
		}
		
	}


	@Override
	public void showGameRoom() {
	}

}
