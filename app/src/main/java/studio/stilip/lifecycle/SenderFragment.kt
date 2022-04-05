package studio.stilip.lifecycle

import android.content.Context
import android.os.Bundle
import android.os.Message
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels

class SenderFragment : Fragment() {

    private val model: ReceiverViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG: ","SenderFragment -> onCreateView")
        return inflater.inflate(R.layout.sender_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.b_send).setOnClickListener {
            openReceiverFragment(view)
        }
    }

    private fun openReceiverFragment(view: View) {
        val edit = view.findViewById<EditText>(R.id.edit_text)
        model.updateMessage(edit.text.toString())
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment, ReceiverFragment())
            .addToBackStack(null)
            .commit()
    }

    override fun onAttach(context: Context) {
        Log.e("TAG: ","SenderFragment -> onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG: ","SenderFragment -> onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.e("TAG: ","SenderFragment -> onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG: ","SenderFragment -> onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG: ","SenderFragment -> onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG: ","SenderFragment -> onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("TAG: ","SenderFragment -> onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("TAG: ","SenderFragment -> onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("TAG: ","SenderFragment -> onDetach")
        super.onDetach()
    }

}
