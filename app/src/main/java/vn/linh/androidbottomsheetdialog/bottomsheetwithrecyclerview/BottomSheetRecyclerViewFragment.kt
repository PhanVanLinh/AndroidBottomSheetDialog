package vn.linh.androidbottomsheetdialog.bottomsheetwithrecyclerview

import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_sheet_dialog_fragment_with_recyclerview.*
import vn.linh.androidbottomsheetdialog.R
import vn.linh.androidbottomsheetdialog.bottomsheetwithrecyclerview.adapter.ContactAdapter
import vn.linh.androidbottomsheetdialog.bottomsheetwithrecyclerview.adapter.ContactItem

class BottomSheetRecyclerViewFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bottom_sheet_dialog_fragment_with_recyclerview, container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    fun initRecyclerView() {
        val adapter = ContactAdapter()

        recycler_view_contact.layoutManager = LinearLayoutManager(requireContext())
        recycler_view_contact.adapter = adapter

        val contactItems = arrayListOf<ContactItem>()
        contactItems.add(ContactItem("A",1))
        contactItems.add(ContactItem("B",1))
        contactItems.add(ContactItem("C",1))
        contactItems.add(ContactItem("D",1))
        contactItems.add(ContactItem("E",1))
        contactItems.add(ContactItem("F",1))
        contactItems.add(ContactItem("G",1))
        contactItems.add(ContactItem("H",1))
        contactItems.add(ContactItem("I",1))
        contactItems.add(ContactItem("J",1))
        contactItems.add(ContactItem("K",1))
        contactItems.add(ContactItem("L",1))
        contactItems.add(ContactItem("M",1))

        adapter.contactItems = contactItems
    }
}