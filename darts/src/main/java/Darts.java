class Darts {

    double x;
    double y;

    Darts(double x, double y) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.x = x;
        this.y = y;
    }

    int score() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if ((x*x +y*y) > 100){
            return 0;
        }else if ((x*x + y*y) > 25){
            return 1;
        }else if ((x*x + y*y) > 1){
            return 5;
        }else{
            return 10;
        }
    }

}
