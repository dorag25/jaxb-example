package legoset;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;   //MEGVAN
import java.util.List;
import java.util.Set;    //MEGVAN


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "tags", "minifigs","weight","url"})
@Data
public class LegoSet {

    private String name;   //megvan
    private String theme;   //megvan
    private String subtheme;    //megvan
    private List<Weight> weight;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;  //megvan

    private int pieces; //megvan

    @XmlElementWrapper(name="tags")
    @XmlElement(name="tag")
    private Set<String> tags;   //megvan

    @XmlElementWrapper(name="minifigs")
    @XmlElement(name="minifig")
    private List<Minifig> minifigs; //megvan

    //@XmlAttribute
    private String url;



   @XmlAttribute
   private int number;
}
