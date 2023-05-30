import java.util.ArrayList;

public class MyFarm2D {
    public static void main(String[] args) {
        MyFarm2D farm = new MyFarm2D();
    }
    ArrayList<Plot> row;
    public Plot[][] grid;
    public MyFarm2D(){
        System.out.println("2d farm");
        row = new ArrayList<>();
        grid = new Plot[5][3];
        System.out.println(grid[2].length);
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                grid[r][c] = new Plot();
            }
        }
        everyOtherNeedsWater();
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                System.out.println(r + ", " + c);
                grid[r][c].printPlotInfo();
            }
        }
        totalPlants();
        printPlantNames();
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
        numberOfEmptyPlots();
        plantWithMaxAndMinNumber();
    }
    public void totalPlants(){
        int numPlants = 0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                numPlants += + grid[r][c].numberOfPlants;
            }
        }
        System.out.println("Total plants: " + numPlants);
    }
    public void printPlantNames(){
        System.out.println("Plant Names: ");
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                if(c<grid[2].length-1){
                    System.out.print(r + ", " + c + ": " + grid[r][c].plantName + ",    ");
                }else{
                    System.out.print(r + ", " + c + ": " + grid[r][c].plantName + ".");
                }
            }
            System.out.println();
        }
    }
    public void totalCarrots() {
        // how many total carrot plants are there?
        int totalCarrots = 0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                if(grid[r][c].plantName == "carrot"){
                    totalCarrots = totalCarrots + grid[r][c].numberOfPlants;
                }
            }
        }
        System.out.println("Total Carrots: " + totalCarrots);
    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole grid?
        int total = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                total += grid[r][c].numberOfPlants;
            }
        }
        System.out.println("Average plants per plot: " + total/(grid.length*grid[0].length));
    }
    public void numberOfTomatoPlots() {
        // how many plots have tomatoes on them
        int tomatoPlots = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if(grid[r][c].plantName == "tomato"){
                    tomatoPlots += 1;
                }
            }
        }
        System.out.println("Tomato Plots: " + tomatoPlots);
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty
        int emptyPlots = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if(grid[r][c].plantName == "empty"){
                    emptyPlots += 1;
                }
            }
        }
        System.out.println("Empty Plots: " + emptyPlots);
    }
    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        // print the value or needs water for all plots row by row
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if((r+c)%2==0){
                    grid[r][c].needsWater = true;
                }
                if((r+c)%2!=0){
                    grid[r][c].needsWater = false;
                }
            }
        }
    }
    public void plantWithMaxAndMinNumber() {
        // which plant type has the most total plants?
        // which plant type has the least total plants (not counting empty plots)?
        int totalTomatoes = 0;
        int totalCarrots = 0;
        int totalLettuce = 0;
        int totalTulips = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if(grid[r][c].plantName == "tomato"){
                    totalTomatoes += grid[r][c].numberOfPlants;
                }if(grid[r][c].plantName == "carrot"){
                    totalCarrots += grid[r][c].numberOfPlants;
                }if(grid[r][c].plantName == "lettuce"){
                    totalLettuce += grid[r][c].numberOfPlants;
                }if(grid[r][c].plantName == "tulip"){
                    totalTulips += grid[r][c].numberOfPlants;
                }
            }
        }
        System.out.println("There are " + totalTomatoes + " tomatoes.");
        System.out.println("There are " + totalCarrots + " carrots.");
        System.out.println("There are " + totalLettuce + " lettuce.");
        System.out.println("There are " + totalTulips + " tulips.");
        if(totalTomatoes>totalCarrots && totalTomatoes>totalLettuce && totalTomatoes>totalTulips){
            System.out.println("There are more tomatoes than any other plant.");
        }if(totalCarrots>totalTomatoes && totalCarrots>totalLettuce && totalCarrots>totalTulips){
            System.out.println("There are more carrots than any other plant.");
        }if(totalLettuce>totalCarrots && totalLettuce>totalTomatoes && totalLettuce>totalTulips){
            System.out.println("There are more lettuce than any other plant.");
        }if(totalTulips>totalCarrots && totalTulips>totalLettuce && totalTulips>totalTomatoes){
            System.out.println("There are more tulips than any other plant.");
        }
        if(totalTomatoes<totalCarrots && totalTomatoes<totalLettuce && totalTomatoes<totalTulips){
            System.out.println("There are less tomatoes than any other plant.");
        }if(totalCarrots<totalTomatoes && totalCarrots<totalLettuce && totalCarrots<totalTulips){
            System.out.println("There are less carrots than any other plant.");
        }if(totalLettuce<totalCarrots && totalLettuce<totalTomatoes && totalLettuce<totalTulips){
            System.out.println("There are less lettuce than any other plant.");
        }if(totalTulips<totalCarrots && totalTulips<totalLettuce && totalTulips<totalTomatoes){
            System.out.println("There are less tulips than any other plant.");
        }
    }
}