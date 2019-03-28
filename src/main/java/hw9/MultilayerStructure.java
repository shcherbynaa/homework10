package hw9;

import org.apache.log4j.Logger;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultilayerStructure {

    private final static Logger LOGGER = Logger.getLogger(ValidateUtil.class.getName());

    public void initializeStructure() {
        Integer integer = 6;
        Set<Integer> set = new HashSet<Integer>(integer);

        List<Set<Integer>> list = new ArrayList<Set<Integer>>();
        list.add(set);

        Map<List<Set<Integer>>, String> map = new HashMap<List<Set<Integer>>, String>();
        map.put(list, "first item");

        List<Map<List<Set<Integer>>, String>> mainList = new ArrayList<Map<List<Set<Integer>>, String>>();
        mainList.add(map);
    }

    public void converObjectToXML(List list) {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("structure.xml")));
            encoder.writeObject(list);
            encoder.close();
        } catch (FileNotFoundException e) {
            LOGGER.error(e.getMessage());
        } finally {
            encoder.close();
        }
    }
}
