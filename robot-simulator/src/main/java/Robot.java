/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/


public class Robot {
    Orientation orientation;
    GridPosition gridPosition;

    Orientation[] list = {Orientation.EAST, Orientation.NORTH, Orientation.WEST, Orientation.SOUTH};

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.orientation = orientation;
        this.gridPosition = gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void setGridPosition(GridPosition gridPosition) {
        this.gridPosition = gridPosition;
    }



    public void turnRight(){
        for (int i = 0 ; i < 4; i++) {
            if (list[i].equals(getOrientation())){
                if (i-1 >= 0){
                    setOrientation(list[i-1]);
                }else{
                    setOrientation(list[i+3]);
                }
                break;
            }
        }
    }

    public void turnLeft(){
        for (int i = 0 ; i < 4; i++) {
            if (list[i].equals(getOrientation())){
                if (i+1 <= 3){
                    setOrientation(list[i+1]);
                }else{
                    setOrientation(list[i-3]);
                }
                break;
            }
        }

    }

    public void advance(){
        switch (this.orientation){
            case EAST: this.gridPosition = new GridPosition(gridPosition.getX()+1, gridPosition.getY());break;
            case WEST: this.gridPosition = new GridPosition(gridPosition.getX()-1, gridPosition.getY());break;
            case NORTH: this.gridPosition = new GridPosition(gridPosition.getX(), gridPosition.getY()+1);break;
            case SOUTH: this.gridPosition = new GridPosition(gridPosition.getX(), gridPosition.getY()-1);break;
        }
    }

    public void simulate(String string){
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            System.out.println(chars[i]);
            switch (chars[i]) {
                case 'L': turnLeft();break;
                case 'R': turnRight();break;
                case 'A': advance();break;
            }
        }
    }
}
