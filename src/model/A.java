package model;

import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.Pattern;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author poojithairosha
 */
public class A {

    public static void main(String[] args) {
//        ---------- Random ID ----------
//        String sid = UUID.randomUUID().toString().replaceAll("-", "");
//        System.out.println(sid);
//        ---------- Random ID ----------

//        ---------- Regex Validation ----------
//        String s = "0";
//        System.out.println(Pattern.compile("([1-9][0-9]*)|(([1-9][0-9]*)[.]([0]*[1-9][0-9]*))|([0][.]([0]*[1-9][0-9]*]))").matcher(s).matches());
//          double d = 10.34536467756;
//          DecimalFormat df = new DecimalFormat("0.00");
//          System.out.println(df.format(d));
//        ---------- Regex Validation ----------
//        ---------- Simple Date Format ----------
//        String s = "1998-07-20";
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        sdf.setLenient(false);
//        
//        try {
//            System.out.println(sdf.parse(s));
//            System.out.println("OK");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ---------- Simple Date Format ----------
//        ---------- Advanced Search ----------
//        try {
//            String x;
//            
//            if(10 < 5) {
//                x = "WHERE `username` ='Inu'";
//            }else {
//                x = "";
//            }
//             
//            
//            ResultSet rs = MySQL.search("SELECT * FROM `user` "+x);
//            
//            while(rs.next()) {
//                System.out.println(rs.getString("name"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ---------- Advanced Search ----------

//        ---------- BarCode ------------
        try {
            JasperReport jr = JasperCompileManager.compileReport("src//reports//barcode.jrxml");
            HashMap parameters = new HashMap();
            
            Vector v = new Vector();
            v.add(new X("1231434"));
            v.add(new X("5768675"));
            v.add(new X("0948592"));
            v.add(new X("7654321"));
            v.add(new X("34240242"));
            
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(v);
            
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSource);
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        ---------- BarCode ------------
    }
}

