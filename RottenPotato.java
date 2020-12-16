public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
        int avg=0;
        for(int i=0; i < ratings.length; i++)
        avg=avg+ratings[0][i];
        
        avg=avg/ratings.length;
       
        
       return avg;
    }

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
         int j=0;
          int avg=0;
          
         
        for(int i=0; i < ratings.length; i++)
        avg=avg+ratings[i][0];
        
        avg=avg/ratings.length;
        
        
       return avg;
    
        
        
        
       
    }

    //Question 3
    public static int avgRating2018(int[][] ratings) {
    
        int min=Integer.MIN_VALUE;
         int avg=0;
        int avg1=0;
        int d=0;
        int avg2=Integer.MIN_VALUE;
        int j=0;
        while(j < ratings.length){
        
        for(int i=0; i < ratings[0].length; i++){
             avg1=avg1+ratings[j][i];
             
       
            d=i;
        }
        
        j++;
        }
        avg1=avg1/(d*j);
        return avg1;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
     
        int avg=0;
        int avg1=0;
        int avg2=Integer.MAX_VALUE;
        int j=0;
       while(j < ratings[0].length){
        
        for(int i=0; i < ratings[0].length; i++){
             avg1=avg1+ratings[i][j];
             avg1=avg/ratings.length;
             avg=Math.min(avg1,avg2);
       
            
        }
        avg2=avg1;
        j++;
        }
        
      return avg;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        
        int avg=0;
        for(int i=0; i < ratings.length; i++)
        avg=avg+ratings[0][i];
        
        avg=avg/ratings.length;
       
        
       return avg;
    }
}
    