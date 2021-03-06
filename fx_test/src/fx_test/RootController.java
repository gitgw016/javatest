package fx_test;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class RootController implements Initializable {
	
	@FXML private Button btnAdd, btnGraph;
	@FXML private TableView<RootVO> tableView;
	@FXML private PieChart pieChart;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<RootVO> list = FXCollections.observableArrayList();
		list.add(new RootVO("홍길동A",40,60,80));
		list.add(new RootVO("홍길동B",60,80,40));
		list.add(new RootVO("홍길동C",80,40,60));
		
		Field[] fields = RootVO.class.getFields();
		fields = RootVO.class.getDeclaredFields();
		for(int i=0; i<fields.length; i++) {
			String fieldName = fields[i].getName();
			System.out.println(i+", fieldName : "+fieldName);
			tableView.getColumns().get(i).setCellValueFactory(new PropertyValueFactory<>(fieldName));
			
		}
		
		tableView.setItems(list);
		
		tableView.getSelectionModel().selectedItemProperty().addListener((temp,old,newValue)->{
			if(newValue != null) {
				System.out.println(newValue);
				Stage cstage = new Stage();
				pieChart.setData(FXCollections.observableArrayList(new PieChart.Data("영어", newValue.getEnglish()),new PieChart.Data("국어", newValue.getKorean()),new PieChart.Data("수학",newValue.getMath())));
				cstage.setTitle("파이 그래프");
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("Chart.fxml"));
					Scene scene = new Scene(parent);
					cstage.setScene(scene);
					cstage.show();	
				} catch (IOException e) {}
				
				
			}
		});
		
		
		
	}
	

}
