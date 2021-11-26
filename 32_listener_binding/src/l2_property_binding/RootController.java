package l2_property_binding;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {

	@FXML private TextArea textArea1, textArea2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// textArea1, textArea2 두개를 묶음
		Bindings.bindBidirectional(textArea1.textProperty(),textArea2.textProperty());
	}

}
