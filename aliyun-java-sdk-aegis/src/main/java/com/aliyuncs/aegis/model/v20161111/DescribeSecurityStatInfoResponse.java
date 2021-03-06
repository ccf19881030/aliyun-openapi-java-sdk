/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeSecurityStatInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityStatInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private SecurityEvent securityEvent;

	private AttackEvent attackEvent;

	private HealthCheck healthCheck;

	private Vulnerability vulnerability;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public SecurityEvent getSecurityEvent() {
		return this.securityEvent;
	}

	public void setSecurityEvent(SecurityEvent securityEvent) {
		this.securityEvent = securityEvent;
	}

	public AttackEvent getAttackEvent() {
		return this.attackEvent;
	}

	public void setAttackEvent(AttackEvent attackEvent) {
		this.attackEvent = attackEvent;
	}

	public HealthCheck getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(HealthCheck healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Vulnerability getVulnerability() {
		return this.vulnerability;
	}

	public void setVulnerability(Vulnerability vulnerability) {
		this.vulnerability = vulnerability;
	}

	public static class SecurityEvent {

		private Integer seriousCount;

		private Integer suspiciousCount;

		private Integer remindCount;

		private Integer totalCount;

		private List<String> dateArray;

		private List<String> valueArray;

		private List<String> levelsOn;

		public Integer getSeriousCount() {
			return this.seriousCount;
		}

		public void setSeriousCount(Integer seriousCount) {
			this.seriousCount = seriousCount;
		}

		public Integer getSuspiciousCount() {
			return this.suspiciousCount;
		}

		public void setSuspiciousCount(Integer suspiciousCount) {
			this.suspiciousCount = suspiciousCount;
		}

		public Integer getRemindCount() {
			return this.remindCount;
		}

		public void setRemindCount(Integer remindCount) {
			this.remindCount = remindCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getDateArray() {
			return this.dateArray;
		}

		public void setDateArray(List<String> dateArray) {
			this.dateArray = dateArray;
		}

		public List<String> getValueArray() {
			return this.valueArray;
		}

		public void setValueArray(List<String> valueArray) {
			this.valueArray = valueArray;
		}

		public List<String> getLevelsOn() {
			return this.levelsOn;
		}

		public void setLevelsOn(List<String> levelsOn) {
			this.levelsOn = levelsOn;
		}
	}

	public static class AttackEvent {

		private Integer totalCount;

		private List<String> dateArray1;

		private List<String> valueArray2;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getDateArray1() {
			return this.dateArray1;
		}

		public void setDateArray1(List<String> dateArray1) {
			this.dateArray1 = dateArray1;
		}

		public List<String> getValueArray2() {
			return this.valueArray2;
		}

		public void setValueArray2(List<String> valueArray2) {
			this.valueArray2 = valueArray2;
		}
	}

	public static class HealthCheck {

		private Integer mediumCount;

		private Integer highCount;

		private Integer lowCount;

		private Integer totalCount;

		private List<String> dateArray3;

		private List<String> valueArray4;

		private List<String> levelsOn5;

		public Integer getMediumCount() {
			return this.mediumCount;
		}

		public void setMediumCount(Integer mediumCount) {
			this.mediumCount = mediumCount;
		}

		public Integer getHighCount() {
			return this.highCount;
		}

		public void setHighCount(Integer highCount) {
			this.highCount = highCount;
		}

		public Integer getLowCount() {
			return this.lowCount;
		}

		public void setLowCount(Integer lowCount) {
			this.lowCount = lowCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getDateArray3() {
			return this.dateArray3;
		}

		public void setDateArray3(List<String> dateArray3) {
			this.dateArray3 = dateArray3;
		}

		public List<String> getValueArray4() {
			return this.valueArray4;
		}

		public void setValueArray4(List<String> valueArray4) {
			this.valueArray4 = valueArray4;
		}

		public List<String> getLevelsOn5() {
			return this.levelsOn5;
		}

		public void setLevelsOn5(List<String> levelsOn5) {
			this.levelsOn5 = levelsOn5;
		}
	}

	public static class Vulnerability {

		private Integer nntfCount;

		private Integer laterCount;

		private Integer asapCount;

		private Integer totalCount;

		private List<String> dateArray6;

		private List<String> valueArray7;

		private List<String> levelsOn8;

		public Integer getNntfCount() {
			return this.nntfCount;
		}

		public void setNntfCount(Integer nntfCount) {
			this.nntfCount = nntfCount;
		}

		public Integer getLaterCount() {
			return this.laterCount;
		}

		public void setLaterCount(Integer laterCount) {
			this.laterCount = laterCount;
		}

		public Integer getAsapCount() {
			return this.asapCount;
		}

		public void setAsapCount(Integer asapCount) {
			this.asapCount = asapCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<String> getDateArray6() {
			return this.dateArray6;
		}

		public void setDateArray6(List<String> dateArray6) {
			this.dateArray6 = dateArray6;
		}

		public List<String> getValueArray7() {
			return this.valueArray7;
		}

		public void setValueArray7(List<String> valueArray7) {
			this.valueArray7 = valueArray7;
		}

		public List<String> getLevelsOn8() {
			return this.levelsOn8;
		}

		public void setLevelsOn8(List<String> levelsOn8) {
			this.levelsOn8 = levelsOn8;
		}
	}

	@Override
	public DescribeSecurityStatInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityStatInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
