package application;

import java.util.Optional;
import java.util.function.Consumer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox vBox = new VBox();
		vBox.setPrefWidth(200);
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().add(new Button("알리겠다"));
		vBox.getChildren().add(new Button("경고한다"));
		vBox.getChildren().add(new Button("오류떴다"));
		vBox.getChildren().add(new Button("확인한다"));
		vBox.getChildren().add(new Button("입력한다"));
		vBox.getChildren().add(new Button("Custom"));
		vBox.setSpacing(10);
		vBox.setPadding(new Insets(10));
		
		for(Node n : vBox.getChildren()) {
			Button btn = (Button) n;
			btn.setMaxWidth(Double.MAX_VALUE);
			btn.setOnAction(event->{
				handleAlert(btn.getText());
			});
		}
		
		primaryStage.setScene(new Scene(vBox));
		primaryStage.show();
	}
	
	public void handleAlert(String text) {
		switch(text) {
			case "알리겠다" :
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("알림");
				alert.setHeaderText("알림창 \n헤더정보");
				alert.setContentText("content정보\n배민구인가");
				alert.show();
				break;
			case "경고한다" :
				alert = new Alert(AlertType.WARNING);
				alert.setTitle("경고");
				alert.setHeaderText("Header Text");
				alert.setContentText("content 민구");
				alert.show();
				break;
			case "오류떴다" :
				alert = new Alert(AlertType.ERROR);
				alert.setTitle("오류");
				alert.setHeaderText("Header Text");
				alert.setContentText("content 민구");
				alert.show();
				break;
			case "확인한다" :
				alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("확인");
				alert.setHeaderText("배민구는 안선다");
				alert.setContentText("확인시 민구는 평생 안선다.");
				Optional<ButtonType> result = alert.showAndWait();
				// 확인 버튼 선택
				if(result.get() == ButtonType.OK) {
					System.out.println("OK누름 ㅋㅋ");
				}else if(result.get() == ButtonType.CANCEL) {
					// 취소 or 닫기 or alt+f4
					System.out.println("왜 취소함");
				}else {
					System.out.println("모르지만 왜 확인안누름?");
				}
				break;
			case "입력한다" :
				TextInputDialog dialog = new TextInputDialog("입력하라");
				dialog.setTitle("입력");
				dialog.setHeaderText("Text Input Dialog");
				dialog.setContentText("이름을 입력하라");
				Optional<String> res = dialog.showAndWait();
				if(res.isPresent() && !res.get().trim().equals("")) {
					// 텍스트 작성하고 확인버튼 선택
					/*
					res.ifPresent(new Consumer<String>() {
						@Override
						public void accept(String t) {
							System.out.println(t);
						}
					});
					*/
					res.ifPresent(name->{
						System.out.println("이름은 : "+name+"다.");
					});
				}else {
					System.out.println("작성된 값이 없다.");
				}
				break;
			default :
				alert = new Alert(AlertType.INFORMATION,"여기는 content 민구다\n내용을 민구하라",ButtonType.OK,ButtonType.CANCEL,ButtonType.NEXT);
				alert.setTitle("커스텀");
				Optional<ButtonType> result1 = alert.showAndWait();
				if(result1.get() == ButtonType.OK) {
					System.out.println("확인");
				}else if(result1.get() == ButtonType.CANCEL) {
					System.out.println("취소");
				}else {
					System.out.println("NEXT");
				}
				break;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
