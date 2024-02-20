package com.example.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Lab {
    
    @RequestMapping(value = "/calculate")
    public String calculateMarks() {
        // Hardcoded marks for subjects in mid-semester
        int webTechMarksMid = 85;
        int daaMarksMid = 92;
        int networksMarksMid = 78;
        int smdMarksMid = 89;  // Software Modeling and Design
        
        // Hardcoded marks for subjects in end-semester
        int webTechMarksEnd = 78;
        int daaMarksEnd = 88;
        int networksMarksEnd = 92;
        int smdMarksEnd = 91;  // Software Modeling and Design
        
        // Calculate total marks and average marks for both semesters
        int totalMarksMid = webTechMarksMid + daaMarksMid + networksMarksMid + smdMarksMid;
        int totalMarksEnd = webTechMarksEnd + daaMarksEnd + networksMarksEnd + smdMarksEnd;
        
        double weightedTotal = (0.3 * totalMarksMid) + (0.7 * totalMarksEnd);
        double weightedAverage = weightedTotal / 4.0;
        
        // HTML content with CSS for better styling
        String htmlContent = "<html><head><style>" +
            "body { font-family: Arial, sans-serif; background-color: #f5f5f5; text-align: center; }" +
            ".container { max-width: 800px; margin: 0 auto; padding: 20px; background-color: #fff; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); }" +
            "h1 { color: #333; }" +
            "h2 { color: #555; margin-top: 20px; }" +
            "table { width: 100%; border-collapse: collapse; margin-top: 10px; }" +
            "th, td { border: 1px solid #ddd; padding: 10px; text-align: center; }" +
            "th { background-color: #f2f2f2; }" +
            ".result { margin-top: 20px; }" +
            "</style></head><body>" +
            "<div class=\"container\">" +
            "<h1>MarkSheet</h1>" +
            "<h2>MID SEMESTER</h2>" +
            "<table>" +
            "<tr><th>Subject</th><th>Marks</th></tr>" +
            "<tr><td>WEB Technology</td><td>" + webTechMarksMid + "</td></tr>" +
            "<tr><td>DAA</td><td>" + daaMarksMid + "</td></tr>" +
            "<tr><td>Computer Networks</td><td>" + networksMarksMid + "</td></tr>" +
            "<tr><td>SMD</td><td>" + smdMarksMid + "</td></tr>" +
            "<tr><th>Total</th><th>" + totalMarksMid + "</th></tr>" +
            "</table>" +
            "<h2>END SEMESTER</h2>" +
            "<table>" +
            "<tr><th>Subject</th><th>Marks</th></tr>" +
            "<tr><td>WEB Technology</td><td>" + webTechMarksEnd + "</td></tr>" +
            "<tr><td>DAA</td><td>" + daaMarksEnd + "</td></tr>" +
            "<tr><td>Computer Networks</td><td>" + networksMarksEnd + "</td></tr>" +
            "<tr><td>SMD</td><td>" + smdMarksEnd + "</td></tr>" +
            "<tr><th>Total</th><th>" + totalMarksEnd + "</th></tr>" +
            "</table>" +
            "<div class=\"result\">" +
            "<h2>Weighted Results</h2>" +
            "<p><strong>Weighted Total:</strong> " + weightedTotal + "</p>" +
            "<p><strong>Weighted Average:</strong> " + weightedAverage + "</p>" +
            "</div>" +
            "</div>" +
            "</body></html>";
        
        return htmlContent;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Lab.class, args);
    }
}