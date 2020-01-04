import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by denis on 03.01.20.
 */
public class Leaf {
    ArrayList<String> lexeme; //Маркер листа - лексема; во время парсинга - массив лексем
    ArrayList<Leaf> leafs = null; //Побочные листья

    //Конструктор листа дерева результата парсинга
    //Параматры: маркер листа, побочные листья
    Leaf(ArrayList<String> lex, ArrayList<Leaf> l){
        lexeme = lex;
        leafs = l;
    }

    //Параматры: маркер листа *побочные листья - пока пусты*
    Leaf(ArrayList<String> lex){
        lexeme = lex;
        leafs = new ArrayList<>();
    }

    //Перевод в строку
    //Для бинарных операторов, затем для унарного отрицания, затем для переменной
    @Override
    public String toString() {
        if (leafs != null && leafs.size() > 1){
            return("(" +lexeme.get(0) + "," + leafs.get(0).toString() + "," + leafs.get(1).toString() + ")");
        }else if (leafs.size() == 1){
            return("(" +lexeme.get(0)  + leafs.get(0).toString()+")");
        }
        return lexeme.get(0);

    }



}
