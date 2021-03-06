package nov_last1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RootController implements Initializable {

	@FXML private Button btnLog, btnJoin;
	@FXML private TextField txtID, txtPw;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLog.setOnAction(event->{
			String id = txtID.getText();
			String pw = txtPw.getText();
			System.out.println("id : "+id);
			System.out.println("pw : "+pw);
			
		});
		
		btnJoin.setOnAction(event->{
			try {
				Parent root = FXMLLoader.load(getClass().getResource("Root2.fxml"));
				Stage stage = new Stage();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {}
		});
	}

}
