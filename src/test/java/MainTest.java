import com.example.factory.Constant;
import com.example.factory.FruitStore;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author ccy
 * @create 2023-11-09 22:42
 */
public class MainTest {

    @Test
    public void test() {
        FruitStore fruitStore = new FruitStore();
        System.out.println("-----------------------------没促销的没芒果-----------------------------");
        String count1 = fruitStore.countFruit("Apple 55,Strawberry 5.8", Constant.NO_PROMOTION);
        Assert.assertEquals(count1, "515.40");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------没促销的价格-------------------------------");
        String count2 = fruitStore.countFruit("Apple 55,Strawberry 5.8,Mango 5.8", Constant.NO_PROMOTION);
        Assert.assertEquals(count2, "631.40");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------草莓8折-----------------------------------");
        String count3 = fruitStore.countFruit("Apple 55,Strawberry 5.8,Mango 5.8", Constant.DISCOUNT);
        Assert.assertEquals(count3, "616.32");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------草莓8折总价满100少10元---------------------");
        String count4 = fruitStore.countFruit("Apple 55,Strawberry 5.8,Mango 5.8", Constant.PROMOTION);
        Assert.assertEquals(count4, "556.32");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------临界值99块钱--------------------------------");
        String count5 = fruitStore.countFruit("Apple 5,Strawberry 5.1,Mango 0.3", Constant.PROMOTION);
        Assert.assertEquals(count5, "99.04");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------临界值100块钱-------------------------------");
        String count6 = fruitStore.countFruit("Apple 5,Strawberry 5.2,Mango 0.4", Constant.PROMOTION);
        Assert.assertEquals(count6, "92.08");
    }
}
