package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aishwary on 7/22/2015.
 */
public class TimeUtil {
     public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss zzz";

    /**
     * @param dateString
     * @param format
     * @return
     */

     public static Date stringToDate(String dateString, String format){

         try {
             SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
             return simpleDateFormat.parse(dateString);
         } catch (ParseException e) {

             throw new RuntimeException(
                     "Error when  getDateFromString from dateString, errmsg: "
                             + e.getMessage(), e);

         }

     }

       public static Date toDateFormat(String dateString){
             return stringToDate(dateString, DATE_FORMAT);
       }


      public static String dateToString(Date date, String format){
             SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
               return simpleDateFormat.format(date);
      }

       public static String toStringFormat(Date date) {
           if (date == null)
               return " ";
               return dateToString(date, DATE_FORMAT);


           }
       }




