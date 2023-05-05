import java.util.ArrayList;

public class MyFarm {
    //declare
    ArrayList<Plot> row;
    public static void main(String[] args) {
        System.out.println("Farm Info:");
        MyFarm LettuceCode = new MyFarm();
    }

    //MyFarm is the constructor method
    public MyFarm(){
        //construct
        row = new ArrayList<>();
        //fill
        for(int r=0;r<10;r++){
            row.add(new Plot());
        }
        //test
        for(int s=0;s<row.size();s++){
            System.out.println(s + ": ");
            row.get(s).printPlotInfo();
        }
        totalPlants();
        printPlantNames();
        greaterThan50();
        plantWithMaxAndMinNumber();
        plantWithMaxNumberNeedsWater();
    }
    public void totalPlants(){
        //how many total plants are there in the row?
        int total=0;
        System.out.println("Total Plants:");
        for(int t=0;t<row.size();t++){
            total=total+row.get(t).numberOfPlants;
        }
        System.out.println("There are " + total + " total plants in the row.");
    }
    public void printPlantNames(){
        System.out.println("Plant Names: ");
        for(int u=0;u<row.size();u++){
            if(u<row.size()-1){
                System.out.print(u + ": " + row.get(u).plantName + ", ");
            }else{
                System.out.print(u + ": " + row.get(u).plantName + ".");
            }
        }
        System.out.println();
    }
    public void printRowInfo(){
        //completed in plot class
        for(int v=0;v<row.size();v++){
            printPlantNames();
        }
    }
    public void addLettuce(){
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;
        printPlantNames();
    }
    public void addTulip() {
        row.add(new Plot());
        row.get(11).plantName = "tulip";
        row.get(11).numberOfPlants = 70;
        row.get(11).needsWater = false;
        //add row info
        printPlantNames();
    }
    public void tomatoLocations() {
        String tomatoLocations = new String("Rows with tomatoes: ");
        for(int i=0; i<row.size(); i++){
            if(row.get(i).plantName=="tomato"){
                tomatoLocations = tomatoLocations + i + " ";
            }
        }
        System.out.println(tomatoLocations);
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
    }
    public void totalCarrots() {
        // how many total carrot plants are there?
        System.out.println("Total Carrots:");
        int totalCarrots=0;
        for(int t=0;t<row.size();t++){
            if(row.get(t).plantName=="carrot"){
                totalCarrots=totalCarrots+row.get(t).numberOfPlants;
            }
        }
        System.out.println("There are " + totalCarrots + " total carrots.");
    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int total=0;
        System.out.println("Total Plants:");
        for(int t=0;t<row.size();t++){
            total=total+row.get(t).numberOfPlants;
        }
        System.out.println("There is an average of " + (total/row.size()) + " plants per row.");
    }
    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
        // call printPlantNames() method to check
        int numberOfCarrotPlots=0;
        System.out.println("Total Carrot Plots:");
        for(int t=0;t<row.size();t++){
            if(row.get(t).plantName=="carrot")
            numberOfCarrotPlots=numberOfCarrotPlots+1;
        }
        System.out.println("There are " + numberOfCarrotPlots + " carrot plots.");
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty
        // call printPlantNames() method to check
        int numberOfEmptyPlots=0;
        System.out.println("Total Empty Plots:");
        for(int t=0;t<row.size();t++){
            if(row.get(t).plantName=="empty")
                numberOfEmptyPlots=numberOfEmptyPlots+1;
        }
        System.out.println("There are " + numberOfEmptyPlots + " empty plots.");
    }
    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        for(int v=0;v<row.size();v++){
            row.get(v).needsWater=true;
        }
        for(int w=0;w<row.size();w+=2){
            row.get(w).needsWater=false;
        }
    }
    public void greaterThan50() {
        // how many plots have more than 50 plants in the plot?
        int greaterThan50=0;
        for(int t=0;t<row.size();t++){
            if(row.get(t).numberOfPlants>50){
                greaterThan50=greaterThan50+1;
            }
        }
        System.out.println("There are " + greaterThan50 + " plots with over 50 plants.");
    }
    public void plantWithMaxAndMinNumber() {
        // which plant type has the most total plants?
        // which plant type has the least total plants (not counting empty plots)?
        int numberOfTomato = 0;
        int numberOfCarrot = 0;
        int numberOfLettuce = 0;
        int numberOfTulip = 0;
        for(int y=0;y<row.size();y++){
            if(row.get(y).plantName=="tomato"){
                numberOfTomato = numberOfTomato + row.get(y).numberOfPlants;
            }if(row.get(y).plantName=="carrot"){
                numberOfCarrot = numberOfCarrot + row.get(y).numberOfPlants;
            }if(row.get(y).plantName=="lettuce"){
                numberOfLettuce = numberOfLettuce + row.get(y).numberOfPlants;
            }if(row.get(y).plantName=="tulip"){
                numberOfTulip = numberOfTulip + row.get(y).numberOfPlants;
            }
        }
        System.out.println("There are " + numberOfTomato + " tomatoes.");
        System.out.println("There are " + numberOfCarrot + " carrots.");
        System.out.println("There are " + numberOfLettuce + " letti.");
        System.out.println("There are " + numberOfTulip + " tulips.");
        if(numberOfTomato>numberOfCarrot && numberOfTomato>numberOfLettuce && numberOfTomato>numberOfTulip){
            System.out.println("There are more tomatoes than any other plant.");
        }if(numberOfCarrot>numberOfTomato && numberOfCarrot>numberOfLettuce && numberOfCarrot>numberOfTulip){
            System.out.println("There are more carrots than any other plant.");
        }if(numberOfLettuce>numberOfCarrot && numberOfLettuce>numberOfTomato && numberOfLettuce>numberOfTulip){
            System.out.println("There are more letti than any other plant.");
        }if(numberOfTulip>numberOfCarrot && numberOfTulip>numberOfLettuce && numberOfTulip>numberOfTomato){
            System.out.println("There are more tulips than any other plant.");
        }
        if(numberOfTomato<numberOfCarrot && numberOfTomato<numberOfLettuce && numberOfTomato<numberOfTulip){
            System.out.println("There are less tomatoes than any other plant.");
        }if(numberOfCarrot<numberOfTomato && numberOfCarrot<numberOfLettuce && numberOfCarrot<numberOfTulip){
            System.out.println("There are less carrots than any other plant.");
        }if(numberOfLettuce<numberOfCarrot && numberOfLettuce<numberOfTomato && numberOfLettuce<numberOfTulip){
            System.out.println("There are less letti than any other plant.");
        }if(numberOfTulip<numberOfCarrot && numberOfTulip<numberOfLettuce && numberOfTulip<numberOfTomato){
            System.out.println("There are less tulips than any other plant.");
        }
    }
    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?
        int totalTomatoNeedsWater = 0;
        int totalCarrotNeedsWater = 0;
        int totalLettuceNeedsWater = 0;
        int totalTulipNeedsWater = 0;
        for(int z=0;z<row.size(); z++){
            if(row.get(z).plantName=="tomato" && row.get(z).needsWater==true){
                totalTomatoNeedsWater = totalTomatoNeedsWater + row.get(z).numberOfPlants;
            }if(row.get(z).plantName=="carrot" && row.get(z).needsWater==true){
                totalCarrotNeedsWater = totalCarrotNeedsWater + row.get(z).numberOfPlants;
            }if(row.get(z).plantName=="lettuce" && row.get(z).needsWater==true){
                totalLettuceNeedsWater = totalLettuceNeedsWater + row.get(z).numberOfPlants;
            }if(row.get(z).plantName=="tulip" && row.get(z).needsWater==true){
                totalTulipNeedsWater = totalTulipNeedsWater + row.get(z).numberOfPlants;
            }
        }
        System.out.println("There are " + totalTomatoNeedsWater + " tomatoes that need water.");
        System.out.println("There are " + totalCarrotNeedsWater + " carrots that need water.");
        System.out.println("There are " + totalLettuceNeedsWater + " letti that need water.");
        System.out.println("There are " + totalTulipNeedsWater + " tulips that need water.");
        if(totalTomatoNeedsWater>totalCarrotNeedsWater && totalTomatoNeedsWater>totalLettuceNeedsWater && totalTomatoNeedsWater > totalTulipNeedsWater){
            System.out.println("Tomatoes need water more than any other plant.");
        }if(totalCarrotNeedsWater>totalTomatoNeedsWater && totalCarrotNeedsWater>totalLettuceNeedsWater && totalCarrotNeedsWater>totalTulipNeedsWater){
            System.out.println("Carrots need water more than any other plant.");
        }if(totalLettuceNeedsWater>totalTomatoNeedsWater && totalLettuceNeedsWater>totalCarrotNeedsWater && totalLettuceNeedsWater>totalTulipNeedsWater){
            System.out.println("Letti need water more than any other plant.");
        }if(totalTulipNeedsWater>totalTomatoNeedsWater && totalTulipNeedsWater>totalCarrotNeedsWater & totalTulipNeedsWater>totalLettuceNeedsWater){
            System.out.println("Tulips need water more than any other plant.");
        }
    }
}