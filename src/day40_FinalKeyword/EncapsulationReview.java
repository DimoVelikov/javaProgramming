package day40_FinalKeyword;

import day39_OOPrecap.ShapesTask.Circle;
import day39_OOPrecap.ShapesTask.Square;

public class EncapsulationReview {

   private Circle circle;

   private Square square;

   public Circle getCircle(){
       return circle;
   }

   public void setCircle(Circle circle){
       if(circle.getR()<0){
           System.err.println("Invalid radius input");
           System.exit(1);
       }
       this.circle= circle;
   }

   public Square getSquare(){
       return square;
   }

   public void setSquare(Square square){
       this.square= square;
   }


}
