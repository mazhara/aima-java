package aima.core.search.uninformed;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import aima.core.agent.Action;
import aima.core.search.framework.Metrics;
import aima.core.search.framework.Node;
import aima.core.search.framework.QueueFactory;
import aima.core.search.framework.Search;
import aima.core.search.framework.problem.Problem;
import aima.core.search.framework.qsearch.QueueSearch;

/**
 * Artificial Intelligence A Modern Approach (3rd Edition): page 85.<br>
 * <br>
 * Depth-first search always expands the deepest node in the current frontier of
 * the search tree. <br>
 * <br>
 * <b>Note:</b> Supports TreeSearch, GraphSearch, and BidirectionalSearch. Just
 * provide an instance of the desired QueueSearch implementation to the
 * constructor!
 * 
 * @author Ravi Mohan
 * @author Ruediger Lunde
 * 
 */
public class DepthFirstSearch implements Search {

	QueueSearch implementation;

	public DepthFirstSearch(QueueSearch impl) {
		this.implementation = impl;
	}

	public List<Action> search(Problem p) {
		return implementation.search(p, QueueFactory.<Node>createLifoQueue());
	}

	public Metrics getMetrics() {
		return implementation.getMetrics();
	}
}