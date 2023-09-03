

public class GetShortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            //South
            if(direction == 'S'){
                y--;
            }
            //North
            else if(direction == 'N'){
                y++;
            }
            //West
            else if(direction == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int xSqaure = x*x;
        int ySqaure = y*y;
        return (float)Math.sqrt(xSqaure+ySqaure);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNEWNNNEE";
        System.out.print("Shortest path is : ");
        System.out.print(getShortestPath(path));
    }
}
