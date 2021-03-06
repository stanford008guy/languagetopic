import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.semgraph.SemanticGraph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


public class Question implements Serializable{
    
	Annotation question; // query
	
    ArrayList<Annotation> choices = new ArrayList<Annotation>();	// different choices

    int correct;
    int type; 	// 1 - one, 2 - multiple
    int number;
    EntityGraph entityGraph;
    ArrayList<EntityGraph> choiceGraphs = new ArrayList<EntityGraph>();

    // dep graph
    SemanticGraph depGraph;

    // Turn Q + A into a statement
    ArrayList<Annotation> choicesReformatted = new ArrayList<Annotation>();

    // debug vars
    HashMap<String, Double> sent2ExpScores = new HashMap<String, Double>();
    ArrayList<HashMap<String, Double>> ans2sent2ExpScores = new ArrayList<HashMap<String, Double>>();

    Question() {
        correct = -1;
    }
}