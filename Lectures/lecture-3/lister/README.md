Til denne opgave må du ikke benytte javas indbyggede Collections (e.g. ArrayLists). 

Overvej følgende `queue-interface`: 

```
public interface IQueue {
	//Add element to the queue
	void enqueue(Object o)
	
	// Read next element
	Object front ();
	
	
	// Remove next element
	void pop ();
	// is the queue empty?
	boolean	empty()
}
```

- Lav en implementation, der benytter et array som "container". Den skal dynamisk udvides når kapaciteten overskrides
- Lav en implementation, der implementeres som Single-linked list.
- Afprøv dine implementationer i en main funktion.
- Lav kode der viser brugen af polymorfisme.  


## Generisk Queue
Ændr interfacet (og din implementation) til at være generisk. 


