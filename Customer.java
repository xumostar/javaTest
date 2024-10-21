package 恋与宠物店;
import java.time.LocalDate;

//顾客类
class Customer {
    @Override
    public String toString(){
        return "顾客名："+this.name+"\n到点次数："+visitFrequency+"\n最新到店时间:"+lastVisitDate;
    }
    
    private String name;
    private int visitFrequency;
    private LocalDate lastVisitDate;
}