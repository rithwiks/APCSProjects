import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;


public class Unit15Lab1a extends Application
{
	TextField first = new TextField();
	TextField second = new TextField();
	TextField sum = new TextField();
	String fvalue;
	String svalue;
	String sumInput;
	
        public void start(Stage myStage)
        {
                myStage.setTitle("SImple Calculator");
                GridPane gridPane = new GridPane();
                gridPane.setPadding(new Insets(30));
                gridPane.setHgap(5);
                gridPane.setVgap(5);
                gridPane.setAlignment(Pos.CENTER);

                Scene myScene = new Scene(gridPane, 300, 200);
                myStage.setScene(myScene);
                myStage.show();

                gridPane.add(new Label("First Value:"), 0, 0);
                gridPane.add(first, 1, 0);
                gridPane.add(new Label("Second Value:"), 0, 1);
                gridPane.add(second, 1, 1);
                gridPane.add(new Label("Sum is:"), 0, 2);
                gridPane.add(sum, 1, 2);
		sum.setEditable(false);
                Button aButton = new Button("Calculate");
		aButton.setOnAction(new ButtonHandler());
                gridPane.add(aButton, 1, 3);
                gridPane.setHalignment(aButton, HPos.RIGHT);
        }

	class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			fvalue = first.getText();
			svalue = second.getText();
			sumInput = Integer.toString((Integer.parseInt(fvalue) + Integer.parseInt(svalue)));
                        sum.setText(sumInput);

		}
	}
	
        public static void main(String [] args)
        {
                launch(args);
        }
}

