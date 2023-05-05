public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(){
        numberOfPlants=(int)((Math.random()*90)+10);
        int plantID=(int)(Math.random()*5);
        int waterID=(int)(Math.random()*2);
        if(plantID==0){
            plantName="tomato";
        }else if(plantID==1){
            plantName="carrot";
        }else if(plantID == 2){
            plantName="lettuce";
        }else if(plantID ==3){
            plantName="tulip";
        }else{
            plantName="empty";
            numberOfPlants=0;
        }
        if(waterID==0 && !plantName.equals("empty")){
            needsWater=true;
        }else{
            needsWater=false;
        }

    }

    public void printPlotInfo(){
        System.out.println("This is a " + plantName + ".");
        System.out.println("There are " + numberOfPlants + " plants.");
        System.out.println("It is " + needsWater + " that this plant needs water.");
    }
}
