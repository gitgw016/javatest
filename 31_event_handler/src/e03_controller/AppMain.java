package e03_controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AppMain extends Application {

	@Override
	public void start(Stage s) {
		System.out.println("start 호출");
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
			System.out.println("fxml load");
			Scene scene = new Scene(root);
			s.setScene(scene);
			s.setOnCloseRequest(new EventHandler<WindowEvent>() {
				public void handle(WindowEvent event) {
					System.out.println("닫기 mingu에서 해방");
					// 기존에 event가 가지고 있는 순기능을 무시
					event.consume();
					System.out.println("5초 뒤 mingu에서 해방");
					System.out.println(Thread.currentThread());
					try {
						Thread.sleep(5000);
						// 무대를 닫는다 - 종료
						s.close();
						System.out.println("해방이다!!");
					} catch (InterruptedException e) {}
				}
			});
			s.show();
			System.out.println("stage show");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
