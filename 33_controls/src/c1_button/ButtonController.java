package c1_button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ButtonController implements Initializable {
	
	@FXML private BorderPane root;
	@FXML private CheckBox chk1,chk2;
	@FXML private ImageView checkImageView, radioImageView;
	@FXML private ToggleGroup group;
	@FXML private Hyperlink hyperlink;
	@FXML private Button btnExit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		chk1.setOnAction(event->handlerChkAction(event));
		chk2.setOnAction(event->handlerChkAction(event));
		
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				RadioButton value = (RadioButton)newValue;
				String text = value.getText();
				System.out.println(text);
				text = "../images/"+text+".png";
				String path = getClass().getResource(text).toString();
				Image image = new Image(path);
				radioImageView.setImage(image);
			}
		});
		
		btnExit.setOnAction(event->{
			// UI thread 강제 종료
			Platform.exit();
		});
		
		hyperlink.setOnAction(event->{
			//hyperlink.setUserData(new Object());
			Object o = hyperlink.getUserData();
			String link = (String)o;
			// 도메인 정보를 가지고 웹 화면을 보여주는 view
			WebView webView = new WebView();
			WebEngine we = webView.getEngine();
			// script를 허용 해줌 (기본은 x)
			we.setJavaScriptEnabled(true);
			we.load(link);
			// root.setTop(webView);
			
			Stage stage = new Stage();
			BorderPane pane = new BorderPane();
			pane.setCenter(webView);
			stage.setScene(new Scene(pane));
			stage.setWidth(1920);
			stage.setHeight(1020);
			stage.show();
		});
	}
	
	public void handlerChkAction(ActionEvent event) {
		System.out.println(chk1.isSelected());
		System.out.println(chk2.isSelected());
		
		String resource = "";
		if(chk1.isSelected() && chk2.isSelected()) {
			resource = "../images/geek-glasses.gif";
		}else if(chk1.isSelected()) {
			resource = "../images/geek.gif";
		}else if(chk2.isSelected()) {
			resource = "../images/geek-glasses-hair.gif";
		}else {
			resource = "../images/geek-hair.gif";
		}
		checkImageView.setImage(new Image(getClass().getResource(resource).toString()));
	}

}
