package application;


import application.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

class MenuBox extends VBox {
	MenuBox(MenuItem... items) {
		getChildren().add(createSeparator());

		for (MenuItem item : items) {
			getChildren().addAll(item, createSeparator());
		}
	}

	private Line createSeparator() {
		Line sep = new Line();
		sep.setEndX(175);
		sep.setStroke(Color.DARKGRAY);
		return sep;
	}
}
