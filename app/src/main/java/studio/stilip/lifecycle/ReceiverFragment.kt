package studio.stilip.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels

class ReceiverFragment : Fragment() {

    private val model: ReceiverViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG: ","ReceiverFragment -> onCreateView")
        return inflater.inflate(R.layout.receiver_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textField = view.findViewById<TextView>(R.id.text_field)

        model.messageLiveData.observe(viewLifecycleOwner) {
            textField.text = it
        }

        view.findViewById<Button>(R.id.b_read).setOnClickListener {
            model.updateMessage(resources.getText(R.string.all_read).toString())
        }
    }

    override fun onAttach(context: Context) {
        Log.e("TAG: ","ReceiverFragment -> onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG: ","ReceiverFragment -> onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.e("TAG: ","ReceiverFragment -> onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG: ","ReceiverFragment -> onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG: ","ReceiverFragment -> onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG: ","ReceiverFragment -> onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("TAG: ","ReceiverFragment -> onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("TAG: ","ReceiverFragment -> onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("TAG: ","ReceiverFragment -> onDetach")
        super.onDetach()
    }

}