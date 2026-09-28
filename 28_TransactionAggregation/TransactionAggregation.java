import java.util.*;
import java.util.stream.Collectors;
public class TransactionAggregation {
    record Transaction(String account,String type,String status,double amount){}
    public static Map<String,double[]> summarize(List<Transaction> tx){
        return tx.stream().filter(Objects::nonNull).filter(t->t.account()!=null&&t.amount()>=0&&"SUCCESS".equalsIgnoreCase(t.status()))
            .collect(Collectors.groupingBy(Transaction::account,LinkedHashMap::new,Collectors.collectingAndThen(Collectors.toList(), list -> {
                double credit=0,debit=0; for(Transaction t:list){if("CREDIT".equalsIgnoreCase(t.type()))credit+=t.amount();else if("DEBIT".equalsIgnoreCase(t.type()))debit+=t.amount();}
                return new double[]{credit,debit};
            })));
    }
}