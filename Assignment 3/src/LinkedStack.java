public class  LinkedStack<T> implements StackInterface<T>
{
  private Node topNode; // references the first node in the chain

  public LinkedStack()
  {
    topNode = null;
  } // end default constructor

  public void push(T newEntry)
  {
    Node newNode = new Node(newEntry, topNode);
    topNode = newNode;

  } // end push

  public T peek()
  {   // return null if it is empty
    T top = null;
    if(topNode != null){
      top = topNode.getData();
    }

    return top;
  } // end peek

  public T pop()
  {  // return null if it is empty
    T top =  peek();
    if(topNode != null){
      topNode = topNode.getNextNode();
    }

    return top;
  } // end pop

  public boolean isEmpty()
  {
    return topNode == null;
  } // end isEmpty

  public void clear()
  {
    topNode = null;
  } // end clear

  private class Node
  {
    private T data; // entry in Bag
    private Node next; // link to next node

    private Node(T dataPortion)
    {
      data = dataPortion;
      next = null;
    } // end constructor

    private Node(T dataPortion, Node nextNode)
    {
      data = dataPortion;
      next = nextNode;
    } // end constructor

    private T getData()
    {
      return data;
    } // end getData

    private void setData(T newData)
    {
      data = newData;
    } // end setData

    private Node getNextNode()
    {
      return next;
    } // end getNextNode

    private void setNextNode(Node nextNode)
    {
      next = nextNode;
    } // end setNextNode
  } // end Node

} // end LinkedStack
