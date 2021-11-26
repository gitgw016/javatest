package e03_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class RootController implements Initializable {
	// id값과 동일한 필드 선언 @FXML
	// fxml 파일에 등록된 요소의 타입과 fx:id가 변수명과 일치해야한다.
	@FXML private Button mingu1;
	@FXML private Button mingu2;
//	@FXML private Button mingu3;
	
	public RootController() {
		System.out.println("RootController 생성자 호출");
	}

	// 초기화 메소드
	// FXLLoader가 fxml 파일을 로드하고 난 뒤 Controller 객체를 생성하고 initialize method를 호출
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize 호출");
		System.out.println("연결된 FXML 위치 : "+location);
		mingu1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(event.getTarget());
			}
		});
		
		mingu2.setOnAction(event->{
			handleBtnAction(event);
		});
		
		mingu2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println(event);
				// 단시간에 마우스가 클릭된 횟수
				int count = event.getClickCount();
				if(count == 2) {
					System.out.println("double 민구 - "+count);
				}
			}
		});
	}
	
	public void handleBtnAction(ActionEvent event) {
		Node n = (Node)event.getTarget();
		Button btn = (Button)n;
		// 발생한 이벤트 타입 출력
		System.out.println(event.getEventType());
		// 버튼의 텍스트 속성값 출력
		System.out.println(btn.getText());
	}
	
}
