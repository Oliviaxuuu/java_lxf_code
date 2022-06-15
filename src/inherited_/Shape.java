package inherited_;

import javafx.scene.shape.Circle;

public sealed class Shape permits Rect, Circle, Triangle {
}

public final class Rect extends Shape {

}

// sealed类在Java15中是预览状态，要启用它，必须使用参数--enable-preview和--source 15。
