# AndroidBottomSheetDialog

`BottomSheetBehavior` use in case you only want to display from view in bottom, when bottom sheet open there is no dim background

`BottomViewDialog` and `BottomViewDialogFragment` using when you need to display a `bottom view` like a dialog (when bottom view display, there will have a dim background to)

### Note
If we use `RecyclerView` inside `BottomSheet` and below `RecyclerView` we have a `Button` then we need to put the `Button` and `RecyclerView`
inside a `NestedScrollView` to able to scroll down to see the `Button` (don't know the reason yet :D)