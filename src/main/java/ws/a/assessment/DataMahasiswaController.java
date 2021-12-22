/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.a.assessment;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ongen
 */
@Controller
public class DataMahasiswaController {
    @CrossOrigin
    @RequestMapping(value = "/datamahasiswaxml", produces = (MediaType.APPLICATION_XML_VALUE))
    @ResponseBody
    public List<Datamahasiswa> getDataDatamahasiswaXml(){
        List<Datamahasiswa> buffer = new ArrayList();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            buffer = controller.findDatamahasiswaEntities();
        }catch (Exception e){}
        return buffer;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/datamahasiswajson", produces = (MediaType.APPLICATION_JSON_VALUE))
    @ResponseBody
    public List<Datamahasiswa> getDataDatamahasiswaJson(){
        List<Datamahasiswa> buffer = new ArrayList();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            buffer = controller.findDatamahasiswaEntities();
        }catch (Exception e){}
        return buffer;
    }
}
