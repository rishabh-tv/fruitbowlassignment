
import org.junit.Test;
import org.testng.*;


public class FruitsTest {

    @Test
    public void FruitsByColor(){
        Fruits fruits1 = new Fruits("Red", "Medium", "Sweet");
        Fruits fruits2 = new Fruits("Yellow", "Small", "Sour");
        Fruits fruits3 = new Fruits("Red", "Medium", "Sour");
        Fruits fruits4 = new Fruits("Yellow", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();
        MultilayerBowl multilayerBowl =  new MultilayerBowl();

        mixedFruitBowl.addFruit(fruits1,fruits2,fruits3,fruits4);


        Assert.assertEquals(multilayerBowl.yellowfruitcolor(),2);
        Assert.assertEquals(multilayerBowl.Redfruitcolor(),2);
    }

    @Test
    public void getAllFruitsBySize(){
        Fruits fruits1 = new Fruits("Red", "Medium", "Sweet");
        Fruits fruits2 = new Fruits("Yellow", "Small", "Sour");
        Fruits fruits3 = new Fruits("Red", "Medium", "Sour");
        Fruits fruits4 = new Fruits("Yellow", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();
        MultilayerBowl multilayerBowl =  new MultilayerBowl();

        mixedFruitBowl.addFruit(fruits1,fruits2,fruits3,fruits4);



        Assert.assertEquals(multilayerBowl.mediumfruitsize(),3);
        Assert.assertEquals(multilayerBowl.smallfruitsize(),1);
    }

    @Test
    public void getAllFruitsByType(){
        Fruits fruits1 = new Fruits("Red", "Medium", "Sweet");
        Fruits fruits2 = new Fruits("Yellow", "Small", "Sour");
        Fruits fruits3 = new Fruits("Red", "Medium", "Sour");
        Fruits fruits4 = new Fruits("Yellow", "Medium", "Sour");

        Bowl mixedFruitBowl = new Bowl();
        MultilayerBowl multilayerBowl =  new MultilayerBowl();

        mixedFruitBowl.addFruit(fruits1,fruits2,fruits3,fruits4);


        Assert.assertEquals(multilayerBowl.sweetfruittaste(),1);
        Assert.assertEquals(multilayerBowl.sourfruittaste(),3);
    }
}