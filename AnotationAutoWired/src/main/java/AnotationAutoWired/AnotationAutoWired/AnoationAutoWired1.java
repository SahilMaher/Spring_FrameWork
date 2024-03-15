package AnotationAutoWired.AnotationAutoWired;
import org.springframework.beans.factory.annotation.*;

public class AnoationAutoWired1 {

		@Autowired
		@Qualifier("e1")
		Address add;




		
		public AnoationAutoWired1(Address add) {
			super();
			this.add = add;
		}

		public Address getAdd() {
			return add;
		}

		public void setAdd(Address add) {
			this.add = add;
		}

		public AnoationAutoWired1() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "AutoWired [add=" + add + "]";
		}

	}



