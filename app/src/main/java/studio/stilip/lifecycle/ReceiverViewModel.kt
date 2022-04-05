package studio.stilip.lifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReceiverViewModel : ViewModel() {
    private val messageMutableLiveData = MutableLiveData<String>()

    val messageLiveData: LiveData<String>
        get() = messageMutableLiveData

    fun updateMessage(newMessage: String?) {
        messageMutableLiveData.value = newMessage ?: ""
    }
}