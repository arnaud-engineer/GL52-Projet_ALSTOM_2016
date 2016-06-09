package MainMenu;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import de.saxsys.mvvmfx.FluentViewLoader.FxmlViewStep;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World Application");

		 FxmlViewStep<MainMenuView, MainMenuViewModel> view = FluentViewLoader.fxmlView(MainMenuView.class);
	     ViewTuple<MainMenuView, MainMenuViewModel> viewTuple =	view.load();
	     Parent root = viewTuple.getView();
	     primaryStage.setScene(new Scene(root));
	     primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
