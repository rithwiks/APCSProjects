import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class Unit14Lab1 extends Application
{
	public void start(Stage myStage)
	{
		myStage.setTitle("Loan Calculator");
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(30));
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(gridPane, 300, 200);
		myStage.setScene(myScene);
		myStage.show();
		
		gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
		gridPane.add(new TextField(), 1, 0);
		gridPane.add(new Label("Number of Years:"), 0, 1);
		gridPane.add(new TextField(), 1, 1);
		gridPane.add(new Label("Loan Amount:"), 0, 2);
		gridPane.add(new TextField(), 1, 2);
		gridPane.add(new Label("Monthly Payment:"), 0, 3);
		TextField aTextField = new TextField();
		aTextField.setEditable(false);
                gridPane.add(aTextField, 1, 3);
		gridPane.add(new Label("Total Payment:"), 0, 4);
		TextField bTextField = new TextField();
		bTextField.setEditable(false);
                gridPane.add(bTextField, 1, 4);
		Button aButton = new Button("Calculate");
		gridPane.add(aButton, 1, 5);
		gridPane.setHalignment(aButton, HPos.RIGHT); 
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}
}
