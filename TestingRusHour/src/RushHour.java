
public class RushHour {
    public String TrainTicketFare(float time){

        // استخدمنا نظام الوقت بصيغة 24 ساعة

        String ticketPrice="null";
        // الوقت المبهم
        if(time<=0 || time>24)
            throw  new IllegalArgumentException("vague time");
        //ساعة الذروه
        if ((time>=1 && time<=9.50) || (time>16 && time<=19.50) )
            ticketPrice="Full";
        //الوقت العادي
        if ((time>9.50 && time<=16) || (time>19.50 && time<=24) )
            ticketPrice="saver";

        return ticketPrice;

    }
}
