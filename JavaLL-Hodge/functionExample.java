public class functionExample {
   /* public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    */

    public static double salaryCalculator(double hoursPerWeek,
                                          double amountPerHour,
                                          int vacationDays){
        if(hoursPerWeek<0){
            return -1;
        }

        if (amountPerHour<0){
            return -1;
        }
        double weeklyPayCheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays*amountPerHour*8;
        return (weeklyPayCheck*52) - unpaidTime;
    }


    public static void main(String[] args){
       /* double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);
        //calculateTotalMealPrice( 15,  .2,  .08);
        //calculateTotalMealPrice(25, .18,.08);

        double individualMealPrice = groupTotalMealPrice/5;
        System.out.println(individualMealPrice);

        */

        //double result = Math.pow(2, 5);
        //System.out.println(result);
        double salary = salaryCalculator(40, 15, 8);
        System.out.println(salary);

    }
}
