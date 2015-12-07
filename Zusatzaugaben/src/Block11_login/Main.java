package aufgabe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextField txtBenutzername = new TextField();
		PasswordField txtKennwort = new PasswordField();
		Label lblAnmeldung = new Label("Anmeldung");
		lblAnmeldung
				.setStyle("-fx-font-size:16px;-fx-font-weight:bold;-fx-padding:10px");

		Button btnAnmelden = new Button("Anmelden");
		Button btnAbbrechen = new Button("Abbrechen");

		try {

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root);

			GridPane gridPane = new GridPane();
			gridPane.setStyle("-fx-padding:10px");
			gridPane.setHgap(5);
			gridPane.setVgap(5);

			gridPane.add(new Label("Benutzername: "), 0, 0);
			gridPane.add(txtBenutzername, 1, 0);
			gridPane.add(new Label("Kennwort: "), 0, 1);
			gridPane.add(txtKennwort, 1, 1);

			root.setTop(lblAnmeldung);
			root.setCenter(gridPane);

			HBox hBox = new HBox();
			hBox.setAlignment(Pos.BASELINE_RIGHT);
			hBox.getChildren().addAll(btnAnmelden, btnAbbrechen);
			hBox.setStyle("-fx-padding:10");
			root.setBottom(hBox);

			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}