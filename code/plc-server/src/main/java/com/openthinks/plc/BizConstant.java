package com.openthinks.plc;

import com.openthinks.plc.core.common.Valueable;

/**
 * all constant field
 * 
 * @author dailey.yet@outlook.com
 *
 */
public interface BizConstant {

	/**
	 * 操作结果常量值
	 *
	 */
	enum OperationResult implements Valueable<Integer> {
		SUCCESS {
			@Override
			public Integer value() {
				return 0;
			}
		},
		FAILED {
			@Override
			public Integer value() {
				return -1;
			}
		};

		public final static OperationResult valueOf(boolean isSuccess) {
			return isSuccess ? SUCCESS : FAILED;
		}
	}

	enum YesNo {
		Y, N
	}

	public static String join(Enum<?>... enums) {
		if (enums == null || enums.length == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Enum<?> e : enums) {
			sb.append(e.name()).append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

}
