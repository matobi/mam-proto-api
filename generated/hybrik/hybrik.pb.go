// Code generated by protoc-gen-go. DO NOT EDIT.
// source: hybrik.proto

package hybrik

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type JobRequest struct {
	JobId                string   `protobuf:"bytes,1,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JobRequest) Reset()         { *m = JobRequest{} }
func (m *JobRequest) String() string { return proto.CompactTextString(m) }
func (*JobRequest) ProtoMessage()    {}
func (*JobRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_552458008a7cdb9c, []int{0}
}
func (m *JobRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JobRequest.Unmarshal(m, b)
}
func (m *JobRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JobRequest.Marshal(b, m, deterministic)
}
func (dst *JobRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JobRequest.Merge(dst, src)
}
func (m *JobRequest) XXX_Size() int {
	return xxx_messageInfo_JobRequest.Size(m)
}
func (m *JobRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_JobRequest.DiscardUnknown(m)
}

var xxx_messageInfo_JobRequest proto.InternalMessageInfo

func (m *JobRequest) GetJobId() string {
	if m != nil {
		return m.JobId
	}
	return ""
}

type JobResponse struct {
	Job                  *Job     `protobuf:"bytes,1,opt,name=job,proto3" json:"job,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JobResponse) Reset()         { *m = JobResponse{} }
func (m *JobResponse) String() string { return proto.CompactTextString(m) }
func (*JobResponse) ProtoMessage()    {}
func (*JobResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_552458008a7cdb9c, []int{1}
}
func (m *JobResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JobResponse.Unmarshal(m, b)
}
func (m *JobResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JobResponse.Marshal(b, m, deterministic)
}
func (dst *JobResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JobResponse.Merge(dst, src)
}
func (m *JobResponse) XXX_Size() int {
	return xxx_messageInfo_JobResponse.Size(m)
}
func (m *JobResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_JobResponse.DiscardUnknown(m)
}

var xxx_messageInfo_JobResponse proto.InternalMessageInfo

func (m *JobResponse) GetJob() *Job {
	if m != nil {
		return m.Job
	}
	return nil
}

type Job struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name                 string   `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Status               string   `protobuf:"bytes,3,opt,name=status,proto3" json:"status,omitempty"`
	Started              int64    `protobuf:"varint,4,opt,name=started,proto3" json:"started,omitempty"`
	Finished             int64    `protobuf:"varint,5,opt,name=finished,proto3" json:"finished,omitempty"`
	Progress             int32    `protobuf:"varint,6,opt,name=progress,proto3" json:"progress,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Job) Reset()         { *m = Job{} }
func (m *Job) String() string { return proto.CompactTextString(m) }
func (*Job) ProtoMessage()    {}
func (*Job) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_552458008a7cdb9c, []int{2}
}
func (m *Job) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Job.Unmarshal(m, b)
}
func (m *Job) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Job.Marshal(b, m, deterministic)
}
func (dst *Job) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Job.Merge(dst, src)
}
func (m *Job) XXX_Size() int {
	return xxx_messageInfo_Job.Size(m)
}
func (m *Job) XXX_DiscardUnknown() {
	xxx_messageInfo_Job.DiscardUnknown(m)
}

var xxx_messageInfo_Job proto.InternalMessageInfo

func (m *Job) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Job) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Job) GetStatus() string {
	if m != nil {
		return m.Status
	}
	return ""
}

func (m *Job) GetStarted() int64 {
	if m != nil {
		return m.Started
	}
	return 0
}

func (m *Job) GetFinished() int64 {
	if m != nil {
		return m.Finished
	}
	return 0
}

func (m *Job) GetProgress() int32 {
	if m != nil {
		return m.Progress
	}
	return 0
}

type CreateJobRequest struct {
	Dir                  string   `protobuf:"bytes,1,opt,name=dir,proto3" json:"dir,omitempty"`
	File                 string   `protobuf:"bytes,2,opt,name=file,proto3" json:"file,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateJobRequest) Reset()         { *m = CreateJobRequest{} }
func (m *CreateJobRequest) String() string { return proto.CompactTextString(m) }
func (*CreateJobRequest) ProtoMessage()    {}
func (*CreateJobRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_552458008a7cdb9c, []int{3}
}
func (m *CreateJobRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateJobRequest.Unmarshal(m, b)
}
func (m *CreateJobRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateJobRequest.Marshal(b, m, deterministic)
}
func (dst *CreateJobRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateJobRequest.Merge(dst, src)
}
func (m *CreateJobRequest) XXX_Size() int {
	return xxx_messageInfo_CreateJobRequest.Size(m)
}
func (m *CreateJobRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateJobRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateJobRequest proto.InternalMessageInfo

func (m *CreateJobRequest) GetDir() string {
	if m != nil {
		return m.Dir
	}
	return ""
}

func (m *CreateJobRequest) GetFile() string {
	if m != nil {
		return m.File
	}
	return ""
}

type CreateJobResponse struct {
	JobId                string   `protobuf:"bytes,1,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateJobResponse) Reset()         { *m = CreateJobResponse{} }
func (m *CreateJobResponse) String() string { return proto.CompactTextString(m) }
func (*CreateJobResponse) ProtoMessage()    {}
func (*CreateJobResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_hybrik_552458008a7cdb9c, []int{4}
}
func (m *CreateJobResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateJobResponse.Unmarshal(m, b)
}
func (m *CreateJobResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateJobResponse.Marshal(b, m, deterministic)
}
func (dst *CreateJobResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateJobResponse.Merge(dst, src)
}
func (m *CreateJobResponse) XXX_Size() int {
	return xxx_messageInfo_CreateJobResponse.Size(m)
}
func (m *CreateJobResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateJobResponse.DiscardUnknown(m)
}

var xxx_messageInfo_CreateJobResponse proto.InternalMessageInfo

func (m *CreateJobResponse) GetJobId() string {
	if m != nil {
		return m.JobId
	}
	return ""
}

func init() {
	proto.RegisterType((*JobRequest)(nil), "hybrik.JobRequest")
	proto.RegisterType((*JobResponse)(nil), "hybrik.JobResponse")
	proto.RegisterType((*Job)(nil), "hybrik.Job")
	proto.RegisterType((*CreateJobRequest)(nil), "hybrik.CreateJobRequest")
	proto.RegisterType((*CreateJobResponse)(nil), "hybrik.CreateJobResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// HybrikClient is the client API for Hybrik service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type HybrikClient interface {
	GetJob(ctx context.Context, in *JobRequest, opts ...grpc.CallOption) (*JobResponse, error)
	CreateJob(ctx context.Context, in *CreateJobRequest, opts ...grpc.CallOption) (*CreateJobResponse, error)
}

type hybrikClient struct {
	cc *grpc.ClientConn
}

func NewHybrikClient(cc *grpc.ClientConn) HybrikClient {
	return &hybrikClient{cc}
}

func (c *hybrikClient) GetJob(ctx context.Context, in *JobRequest, opts ...grpc.CallOption) (*JobResponse, error) {
	out := new(JobResponse)
	err := c.cc.Invoke(ctx, "/hybrik.Hybrik/GetJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *hybrikClient) CreateJob(ctx context.Context, in *CreateJobRequest, opts ...grpc.CallOption) (*CreateJobResponse, error) {
	out := new(CreateJobResponse)
	err := c.cc.Invoke(ctx, "/hybrik.Hybrik/CreateJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// HybrikServer is the server API for Hybrik service.
type HybrikServer interface {
	GetJob(context.Context, *JobRequest) (*JobResponse, error)
	CreateJob(context.Context, *CreateJobRequest) (*CreateJobResponse, error)
}

func RegisterHybrikServer(s *grpc.Server, srv HybrikServer) {
	s.RegisterService(&_Hybrik_serviceDesc, srv)
}

func _Hybrik_GetJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(JobRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(HybrikServer).GetJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hybrik.Hybrik/GetJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(HybrikServer).GetJob(ctx, req.(*JobRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Hybrik_CreateJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateJobRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(HybrikServer).CreateJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/hybrik.Hybrik/CreateJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(HybrikServer).CreateJob(ctx, req.(*CreateJobRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Hybrik_serviceDesc = grpc.ServiceDesc{
	ServiceName: "hybrik.Hybrik",
	HandlerType: (*HybrikServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetJob",
			Handler:    _Hybrik_GetJob_Handler,
		},
		{
			MethodName: "CreateJob",
			Handler:    _Hybrik_CreateJob_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "hybrik.proto",
}

func init() { proto.RegisterFile("hybrik.proto", fileDescriptor_hybrik_552458008a7cdb9c) }

var fileDescriptor_hybrik_552458008a7cdb9c = []byte{
	// 320 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x51, 0xc1, 0x4e, 0xeb, 0x30,
	0x10, 0x7c, 0x6e, 0x5a, 0x3f, 0xba, 0x41, 0xa8, 0x2c, 0x02, 0xb9, 0x95, 0x90, 0xaa, 0x70, 0xa9,
	0x2a, 0x94, 0x43, 0x7b, 0xe1, 0x5c, 0x0e, 0x40, 0x4f, 0x55, 0x7e, 0x00, 0xc5, 0xd8, 0xa5, 0x2e,
	0x24, 0x2e, 0xb6, 0x7b, 0xe0, 0xc8, 0x37, 0xf0, 0xc3, 0xc8, 0x4e, 0x1a, 0x05, 0xd4, 0xdb, 0xce,
	0xec, 0x78, 0x76, 0x32, 0x81, 0xd3, 0xcd, 0x27, 0x37, 0xea, 0x2d, 0xdd, 0x19, 0xed, 0x34, 0xd2,
	0x0a, 0x25, 0x37, 0x00, 0x4b, 0xcd, 0x33, 0xf9, 0xb1, 0x97, 0xd6, 0xe1, 0x25, 0xd0, 0xad, 0xe6,
	0xcf, 0x4a, 0x30, 0x32, 0x26, 0x93, 0x7e, 0xd6, 0xdb, 0x6a, 0xfe, 0x24, 0x92, 0x5b, 0x88, 0x83,
	0xc8, 0xee, 0x74, 0x69, 0x25, 0x5e, 0x43, 0xb4, 0xd5, 0x3c, 0x48, 0xe2, 0x59, 0x9c, 0xd6, 0xbe,
	0x5e, 0xe1, 0xf9, 0xe4, 0x9b, 0x40, 0xb4, 0xd4, 0x1c, 0xcf, 0xa0, 0xd3, 0x18, 0x75, 0x94, 0x40,
	0x84, 0x6e, 0x99, 0x17, 0x92, 0x75, 0x02, 0x13, 0x66, 0xbc, 0x02, 0x6a, 0x5d, 0xee, 0xf6, 0x96,
	0x45, 0x81, 0xad, 0x11, 0x32, 0xf8, 0x6f, 0x5d, 0x6e, 0x9c, 0x14, 0xac, 0x3b, 0x26, 0x93, 0x28,
	0x3b, 0x40, 0x1c, 0xc1, 0xc9, 0x5a, 0x95, 0xca, 0x6e, 0xa4, 0x60, 0xbd, 0xb0, 0x6a, 0xb0, 0xdf,
	0xed, 0x8c, 0x7e, 0x35, 0xd2, 0x5a, 0x46, 0xc7, 0x64, 0xd2, 0xcb, 0x1a, 0x9c, 0xdc, 0xc1, 0xe0,
	0xde, 0xc8, 0xdc, 0xc9, 0xd6, 0xe7, 0x0e, 0x20, 0x12, 0xca, 0xd4, 0x11, 0xfd, 0xe8, 0x33, 0xae,
	0xd5, 0x7b, 0x93, 0xd1, 0xcf, 0xc9, 0x14, 0xce, 0x5b, 0x2f, 0xeb, 0x0e, 0x8e, 0x37, 0x35, 0xfb,
	0x22, 0x40, 0x1f, 0x43, 0x1f, 0x38, 0x07, 0xfa, 0x20, 0x9d, 0x2f, 0x02, 0xdb, 0x15, 0x55, 0xa7,
	0x47, 0x17, 0xbf, 0xb8, 0xca, 0x34, 0xf9, 0x87, 0x0b, 0xe8, 0x37, 0xb7, 0x90, 0x1d, 0x34, 0x7f,
	0x83, 0x8f, 0x86, 0x47, 0x36, 0x07, 0x8f, 0xc5, 0x14, 0x86, 0x2f, 0xba, 0x48, 0x4b, 0x59, 0xba,
	0xb4, 0xc8, 0x8b, 0xea, 0x87, 0xd7, 0x0f, 0x16, 0x71, 0x95, 0x6e, 0xe5, 0xb9, 0x15, 0xe1, 0x34,
	0x2c, 0xe7, 0x3f, 0x01, 0x00, 0x00, 0xff, 0xff, 0xaa, 0xcd, 0x00, 0x57, 0x1d, 0x02, 0x00, 0x00,
}
