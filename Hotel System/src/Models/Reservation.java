package Models;

public class ReservationClass {
    String reservationId;
    String servicesId;
    String checkIn;
    String checkOut;
    public ReservationClass(String reservationId,String servicesId,String checkIn,String checkOut){
        this.reservationId = reservationId;
        this.servicesId = servicesId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
     public static int day(String date){
            int i = 0;
            String day = "";
            while(true){
                if(date.charAt(i) == '-'){
                    i++;
                    break;
                }
                i++;
            }
            while(true){
                if(date.charAt(i) == '-'){
                    i++;
                    break;
                }
                i++;
            }
            for(int j = i ; j < date.length() ; j++){
                day += date.charAt(j);
            }
            return Integer.parseInt(day);
        }
        public static int month(String date){
            int i = 0;
            String month = "";
            while(true){
                if(date.charAt(i) == '-'){
                    i++;
                    break;
                }
                i++;
            }
            for(int j = i ; j < date.length() ; j++){
                if(date.charAt(j) == '-'){
                    break;
                }
                month += date.charAt(j);
            }
            return Integer.parseInt(month);
        }
        public static int year(String date){
            String year = "";
            for(int j = 0 ; j < date.length() ; j++){
                if(date.charAt(j) == '-'){
                    break;
            }
                year += date.charAt(j);
            }
            return Integer.parseInt(year);
        }
    public int calculateNights(String checkOut , String checkIn){
        if(month(checkOut) == month(checkIn)){
            return day(checkOut)- day(checkIn);
        }
        else if(year(checkOut) == year(checkIn)){
            return (month(checkOut) - month(checkIn)) * 30 + (day(checkOut) -  day(checkIn));
        }
        else{
            return ((month(checkOut) + (12 * (year(checkOut) - year(checkIn))) - month(checkIn)) * 30) + (day(checkOut) -  day(checkIn));
        }
    }
//    public double calculateTotalCost(){
//        //return (room.price * calculateNights())+ service.price;
//        return (23.4 * calculateNights(checkOut , checkIn))+ 23.8;
//    }

}

