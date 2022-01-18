using System;
using System.ComponentModel;
using CollectionContentInset.iOS;
using CoreGraphics;
using Foundation;
using UIKit;
using Xamarin.Forms;
using Xamarin.Forms.Platform.iOS;

[assembly: ExportRenderer(typeof(CollectionView), typeof(MyCollectionViewRenderer))]
namespace CollectionContentInset.iOS
{
    public class MyCollectionViewRenderer : CollectionViewRenderer
    {
        protected override void OnElementChanged(ElementChangedEventArgs<GroupableItemsView> e)
        {
            base.OnElementChanged(e);
            if (e.NewElement != null)
            {
                if (Control != null)
                {
                    var collectionView = Control.Subviews[0] as UICollectionView;
                    collectionView.AlwaysBounceHorizontal = true;
                    collectionView.ContentInset = new UIEdgeInsets(50, 50, 50, 50);
                    //collectionView.Delegate = new CustomUICollectionViewDelegateFlowLayout();
                }
            }
        }
    }
}
