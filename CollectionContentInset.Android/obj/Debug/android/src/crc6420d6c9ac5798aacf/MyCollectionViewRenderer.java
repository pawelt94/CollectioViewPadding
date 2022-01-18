package crc6420d6c9ac5798aacf;


public class MyCollectionViewRenderer
	extends crc643f46942d9dd1fff9.CollectionViewRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("CollectionContentInset.Droid.MyCollectionViewRenderer, CollectionContentInset.Android", MyCollectionViewRenderer.class, __md_methods);
	}


	public MyCollectionViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MyCollectionViewRenderer.class)
			mono.android.TypeManager.Activate ("CollectionContentInset.Droid.MyCollectionViewRenderer, CollectionContentInset.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MyCollectionViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MyCollectionViewRenderer.class)
			mono.android.TypeManager.Activate ("CollectionContentInset.Droid.MyCollectionViewRenderer, CollectionContentInset.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MyCollectionViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MyCollectionViewRenderer.class)
			mono.android.TypeManager.Activate ("CollectionContentInset.Droid.MyCollectionViewRenderer, CollectionContentInset.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
