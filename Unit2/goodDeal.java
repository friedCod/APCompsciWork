public class goodDeal{

public static void goodDealCheck(double originalPrice, double salePrice,
                                 boolean expected){

    boolean result = gooddeal(originalPrice, salePrice);
    System.out.println("original price:" + originalPrice + " salePrice" +
                        salePrice + " expected:" + expected);
    if(result == expected)
      System.out.println("yay");
    else
      System.out.println("nay");
  }

public static boolean gooddeal(double originalPrice, double salePrice){
  if(salePrice <= (0.75*originalPrice))
    return true;
  else
    return false;
 }

public static void main(String[] args){
  goodDealCheck(1, 2, false);
  goodDealCheck(100, 50, false);
  goodDealCheck(100, 50, true);
}

}
