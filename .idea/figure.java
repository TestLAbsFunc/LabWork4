// абстрактный класс фигуры
public abstract class Figure{

    float x; // x-координата точки
    float y; // y-координата точки

    public Figure(float x, float y){

        this.x=x;
        this.y=y;
    }
    // абстрактный метод для получения периметра
    public abstract float getPerimeter();
    // абстрактный метод для получения площади
    public abstract float getArea();

}

// производный класс прямоугольника
class Circle extends Figure
{
    private float radius;
    private static final float PI  = 3.14;


    // конструктор с обращением к конструктору класса Figure
    public Rectangle(float x, float y, float radius){

        super(x,y);
        this.radius= radius;

    }

    public float getPerimeter(){

        return 2*PI*radius;
    }

    public float getArea(){

        return PI*radius*radius;
    }
}