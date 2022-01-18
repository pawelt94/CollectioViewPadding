using Android.Content;
using Android.Views;
using CollectionContentInset.Droid;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

[assembly: ExportRenderer(typeof(CollectionView), typeof(MyCollectionViewRenderer))]
namespace CollectionContentInset.Droid
{
    public class MyCollectionViewRenderer : CollectionViewRenderer
    {
        public MyCollectionViewRenderer(Context context) : base(context)
        {
        }

        protected override void OnElementChanged(ElementChangedEventArgs<ItemsView> elementChangedEvent)
        {
            base.OnElementChanged(elementChangedEvent);
                if (View != null)
                {
                    var view = View as Android.Views.ViewGroup;
                    view.SetClipToPadding(false);
                    view.ScrollBarStyle = ScrollbarStyles.OutsideOverlay;
                    view.SetPadding(50, 50, 50, 50);
                }
            
        }
    }
}
