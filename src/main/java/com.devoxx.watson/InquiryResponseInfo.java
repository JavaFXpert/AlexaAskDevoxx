/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.devoxx.watson;


import java.util.ArrayList;
import java.util.List;

/**
 * Represents the info in an item
 */
public class InquiryResponseInfo {
  private String inquiryText;

  private String responseText;

  private List<DocumentInfo> resources = new ArrayList<>();

  public InquiryResponseInfo() {}

  public InquiryResponseInfo(String inquiryText, String responseText, List<DocumentInfo> resources) {
    this.inquiryText = inquiryText;
    this.responseText = responseText;
    this.resources = resources;
  }

  public String getInquiryText() {
    return inquiryText;
  }

  public void setInquiryText(String inquiryText) {
    this.inquiryText = inquiryText;
  }

  public String getResponseText() {
    return responseText;
  }

  public void setResponseText(String responseText) {
    this.responseText = responseText;
  }

  public List<DocumentInfo> getResources() {
    return resources;
  }

  public void setResources(List<DocumentInfo> resources) {
    this.resources = resources;
  }

  @Override
  public String toString() {
    return "InquiryResponseInfo{" +
        "inquiryText='" + inquiryText + '\'' +
        ", responseText='" + responseText + '\'' +
        ", resources=" + resources +
        '}';
  }
}
