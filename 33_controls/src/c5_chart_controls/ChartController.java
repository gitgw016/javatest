package c5_chart_controls;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class ChartController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart<String,Integer> barChart;
	@FXML private AreaChart<String,Integer> areaChart;
	@FXML private BubbleChart<Integer,Integer> bubbleChart;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// list == PieChart.Data 객체를 저장
		pieChart.setData(FXCollections.observableArrayList(new PieChart.Data("민구", 5),new PieChart.Data("정만", 25),new PieChart.Data("안홍", 30),new PieChart.Data("만규", 60)));

		// BarChart
		XYChart.Series<String, Integer> series1 = new XYChart.Series<>();
		series1.setName("민구");
		XYChart.Series<String, Integer> series2 = new XYChart.Series<>();
		series2.setName("정만");

		ObservableList<XYChart.Data<String, Integer>> list = FXCollections.observableArrayList();
		list.add(new XYChart.Data<>("1900",100));
		list.add(new XYChart.Data<>("1901",102));
		list.add(new XYChart.Data<>("1902",103));
		list.add(new XYChart.Data<>("1903",104));
		series1.setData(list);
		
		list = FXCollections.observableArrayList();
		list.add(new XYChart.Data<>("1900",110));
		list.add(new XYChart.Data<>("1901",111));
		list.add(new XYChart.Data<>("1902",112));
		list.add(new XYChart.Data<>("1903",113));
		series2.setData(list);
		
		barChart.getData().add(series1);
		barChart.getData().add(series2);
		barChart.setTitle("연도별 안주는 수치");
		
		// AreaChart
		areaChart.setTitle("월별 드랍률 대결");
		XYChart.Series<String, Integer> series3 = new XYChart.Series<>();
		series3.setName("안홍");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data<String,Integer>("6",1000),
				new XYChart.Data<String,Integer>("7",1250),
				new XYChart.Data<String,Integer>("8",800),
				new XYChart.Data<String,Integer>("9",760),
				new XYChart.Data<String,Integer>("10",900),
				new XYChart.Data<String,Integer>("11",700)
				));
		areaChart.getData().add(series3);
		
		XYChart.Series<String, Integer> series4 = new XYChart.Series<>();
		series4.setName("만규");
		series4.setData(FXCollections.observableArrayList(
				new XYChart.Data<String,Integer>("6",700),
				new XYChart.Data<String,Integer>("7",750),
				new XYChart.Data<String,Integer>("8",700),
				new XYChart.Data<String,Integer>("9",1100),
				new XYChart.Data<String,Integer>("10",1250),
				new XYChart.Data<String,Integer>("11",1400)
				));
		areaChart.getData().add(series4);
		
		// BubbleChart
		XYChart.Series<Integer, Integer> seriesA = new XYChart.Series<>();
		seriesA.setName("1일");
		//										시간 가격 먹은갯수
		//										 x,y,scale
		seriesA.getData().add(new XYChart.Data<>(1,0,1));
		seriesA.getData().add(new XYChart.Data<>(20,10,8));
		seriesA.getData().add(new XYChart.Data<>(10,20,3));
		seriesA.getData().add(new XYChart.Data<>(2,8,2));
		bubbleChart.getData().add(seriesA);
		
	}

}
