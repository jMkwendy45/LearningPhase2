public interface Exercise {
    int getLength();
    int getBreadth();
    double area(int X);
    double area(int x,int y);
}
abstract class ExerciseImpl implements Exercise {
    private int length;
    private int breadth;

    @Override
    public int getLength() {return length;
    }

    @Override
    public int getBreadth() {
        return breadth;
    }

}


class ConcreteShape extends ExerciseImpl {

    @Override
    public double area(int X) {
        return 0;
    }

    @Override
    public double area(int x, int y) {
        return 0;
    }
}